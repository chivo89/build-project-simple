import axios from 'axios'

export const getBaseURL = () => {
  const protocol = window.location.protocol
  const host = process.env.NODE_ENV === 'production' ? window.location.host : 'localhost:8080'
  const apiEndpoint = process.env.API_ENDPOINT
  return `${protocol}//${host}/${apiEndpoint}`
}

let errorHandler = null
export const setErrorHander = (handler) => {
  errorHandler = handler
}

const customConfig = {
  baseURL: getBaseURL(),
  timeout: 600000 // 10 mins
}

const instance = axios.create(customConfig);

instance.interceptors.response.use(function (response) {
  return response
}, function (error) {
  if (errorHandler && typeof errorHandler === 'function') {
    errorHandler({
      group: 'error',
      title: 'Error',
      type: 'error',
      speed: 5000,
      text: error.response.data.message
    });
  }
  return Promise.reject(error)
})

export default (instance)

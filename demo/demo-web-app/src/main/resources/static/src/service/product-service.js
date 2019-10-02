/**
 * @module service/product-service
 */
import axios from './utils/axios-ex.js'

export function searchAll () {
  return axios.get(`/product`).then(response => {
    return response.data
  })
}

import { Product } from "./types";

export function chekIsSelected(selectedProducts: Product[], product: Product ) {
    return selectedProducts.some(item => item.id === product.id);
}
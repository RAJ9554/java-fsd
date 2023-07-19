import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  productsinfo:Product[];

  constructor() {

    this.productsinfo = [
      new Product(101, "Samsung S8", 15000.00, "Samsung"),
      new Product(102, "Samsung S7", 14000.00, "Samsung"),
      new Product(103, "Iphone 9.0", 65000.00, "IPhone"),
      new Product(104, "Iphone 10.0", 75000.00, "IPhone"),
      new Product(105, "Pixels 4.0", 55000.00, "Google"),
      new Product(106, "Pixels 6.0", 85000.00, "Google")
    ];
   }

   getProductsBasedOnBrand(brand:string):Product[]
   {
      var prdinfos:Product[] = [];
      for(let i=0;i<this.productsinfo.length;i++)
      {
        if(this.productsinfo[i].prdBrand==brand)
        {
          prdinfos.push(this.productsinfo[i]);
        }
      }
      return prdinfos;
   }
}

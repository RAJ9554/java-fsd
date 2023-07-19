import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductsService } from '../products.service';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private route:ActivatedRoute, private prdService:ProductsService) { }

  brand:string;
  products:Product[];
  ngOnInit(): void {
    this.brand = this.route.snapshot.params['brand'];
    this.printProducts();
  }

  printProducts()
  {
    this.products = this.prdService.getProductsBasedOnBrand(this.brand);
  }
}

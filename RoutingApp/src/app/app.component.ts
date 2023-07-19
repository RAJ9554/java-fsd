import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RoutingApp';
  brand:string;

  constructor(private router:Router)
  {}

  getproductinfo()
  {
    this.router.navigate(['prdinfo', this.brand]);
  }
}

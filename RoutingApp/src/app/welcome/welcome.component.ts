import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  personname:string = "Venugopal Arumuru";
  salary:number=100000;
  dt:Date=new Date();
  person:Object={"name":"Kiran Kumar", "sal":10000.00};
  val:number=120000;
  per:number=0.25;
}

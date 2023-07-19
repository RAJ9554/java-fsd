import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  personname:string = "";
  gender:string="";
  haveBike:boolean=false;
  location:string = "";
  msg:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  printValues()
  {
    this.msg = this.personname;
    this.msg += "<br />" + this.gender;
    this.msg += "<br />" + this.haveBike;
    this.msg += "<br />" + this.location;
  }
}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  fname:string = "Venugopal Arumuru";
  url:string="http://www.facebook.com/";


  demofun()
  {
    this.fname = "Sahasra Arumuru";
    //alert("this is an alert box");
  }
}

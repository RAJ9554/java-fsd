import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  personname:string = "akshu";
  salary:number = 100000;
  dt:Date = new Date();
  person:object={"pname":"smarty", "age":23, "loc":"Hyderabad"};
  fees = 150000;
  val = 0.5;
  constructor() { }

  ngOnInit(): void {
  }

}

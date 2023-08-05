import { Component, OnInit } from '@angular/core';
import { Aadhar } from '../aadhar';
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-admin-aadhar-view',
  templateUrl: './admin-aadhar-view.component.html',
  styleUrls: ['./admin-aadhar-view.component.css']
})
export class AdminAadharViewComponent implements OnInit {
  aadhars:Array<Aadhar>=[];
  constructor(public as:AadharService) { }

  ngOnInit(): void {
    this.findAllAadhar();
  }

  findAllAadhar(){
    this.as.findAllAadhar().subscribe({
      next:(result:any)=>this.aadhars=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("complete")
    })
  }

}

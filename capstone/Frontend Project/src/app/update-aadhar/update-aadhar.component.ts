import { Component, OnInit } from '@angular/core';
import { Aadhar } from '../aadhar';
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-update-aadhar',
  templateUrl: './update-aadhar.component.html',
  styleUrls: ['./update-aadhar.component.css']
})
export class UpdateAadharComponent implements OnInit {
  msg:string=""
  aadhar:Array<Aadhar>=[];
  constructor(public as:AadharService) { }

  ngOnInit(): void {
  }
  cid:number=0;
  cname:string="";
  dob:string="";
  address:string="";
  gender:string="";
  emailid:string="";
  number:string="";

  updateAadhar(aadhar:any){
    this.cid=aadhar.cid;
    this.cname=aadhar.cname;
    this.dob=aadhar.dob;
    this.address=aadhar.address;
    this.gender=aadhar.gender;
    this.emailid=aadhar.emailid;
    this.number=aadhar.number;
  }

  updateAadharFromDb(){
    let aadhar = {cid:this.cid,
    cname:this.cname,
    dob:this.dob,
  address:this.address,
  gende:this.gender,
  emailid:this.emailid,
  number:this.number};
  this.as.updateAadhar(aadhar).subscribe({
    next:(result:any)=>console.log(result),
    error:(error:any)=>console.log(error),
    complete:()=>{this.msg="Your Details Submitted Succesfully and Send for Verification"}
    //complete:()=>console.log("completed")
  })
  }
}

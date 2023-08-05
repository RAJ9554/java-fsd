import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-add-aadhar',
  templateUrl: './add-aadhar.component.html',
  styleUrls: ['./add-aadhar.component.css']
})
export class AddAadharComponent implements OnInit {
  
  aadharRef = new FormGroup({
    cname:new FormControl(),
    dob:new FormControl(),
    address:new FormControl(),
    gender:new FormControl(),
    emailid:new FormControl(),
    number:new FormControl()
  })
  storeMsg : string=""
  constructor(public ps:AadharService) { }

  ngOnInit(): void {
  }

  storeAadhar(){
    let aadhar = this.aadharRef.value;
    this.ps.storeAadhar(aadhar).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
    this.aadharRef.reset();
  }

}

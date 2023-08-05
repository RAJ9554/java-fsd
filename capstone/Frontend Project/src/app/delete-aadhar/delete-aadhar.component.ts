import { Component, OnInit } from '@angular/core';
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-delete-aadhar',
  templateUrl: './delete-aadhar.component.html',
  styleUrls: ['./delete-aadhar.component.css']
})
export class DeleteAadharComponent implements OnInit {
  msg:string=""
  constructor(public as:AadharService) { }

  ngOnInit(): void {
  }
  cid:number=0;

  deleteAadhar(cid:number){
    this.as.deleteAadharById(cid).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
        this.msg="Request For Deletion of Aadhar Card Data Has Been Submiited"
      }
    })
  }

}

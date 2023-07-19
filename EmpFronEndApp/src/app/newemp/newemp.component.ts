import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';
@Component({
  selector: 'app-newemp',
  templateUrl: './newemp.component.html',
  styleUrls: ['./newemp.component.css']
})
export class NewempComponent implements OnInit {

  constructor(private empServ:EmployeeService, private router:Router) { }

  ngOnInit(): void {
  }
  emp:Employee = new Employee();
  msg:string = "";
  
  addNewEmployee(frm:any)
  {
      if(frm.valid)
      {
      this.empServ.newEmployee(this.emp).subscribe(data=>{
        console.log(data);
        //alert("New Employee is Added Successfully...");
        this.router.navigate(['vall']);
      });
    }
    else
      this.msg = "Invalid Form";
  }
}

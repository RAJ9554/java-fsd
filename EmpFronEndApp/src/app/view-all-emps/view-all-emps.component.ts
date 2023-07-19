import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-all-emps',
  templateUrl: './view-all-emps.component.html',
  styleUrls: ['./view-all-emps.component.css']
})

export class ViewAllEmpsComponent implements OnInit {

  empinfo : Employee[];
  p:number;
  constructor(private empServ:EmployeeService, private router:Router) { }

  ngOnInit(): void {
    this.showAllEmpInfo();
  }

  showAllEmpInfo()
  {
    this.empServ.GetAllEmployees().subscribe(data=>{
      console.log(data);  
      this.empinfo = data;
    });
  }

  getOneEmpDetails(id:number)
  {
    this.router.navigate(['oneemp', id]);
  }

  DeleteEmployeeInfo(id:number)
  {
    this.empServ.DeleteEmp(id).subscribe(data=>{
      this.showAllEmpInfo();
    });
  }

  UpdateEmpInfo(id:number)
  {
    this.router.navigate(['updateemp', id]);
  }
}

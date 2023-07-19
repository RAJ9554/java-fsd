import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-upate-emp',
  templateUrl: './upate-emp.component.html',
  styleUrls: ['./upate-emp.component.css']
})
export class UpateEmpComponent implements OnInit {

  constructor(private empServ:EmployeeService, private route:ActivatedRoute, 
    private router:Router) { }

  id:number;
  emp:Employee;

  ngOnInit(): void {
    this.showEmpInfo();
  }

  showEmpInfo()
  {
    this.id = this.route.snapshot.params['id'];
    //alert(this.id);
    this.emp = new Employee(); 
    this.empServ.SearchEmp(this.id).subscribe(data=>{
      console.log(data);
      this.emp = data;
    });  
  }

  UpdateEmployeeInfo()
  {
    this.empServ.UpdateEmp(this.id, this.emp).subscribe(data=>{
      this.router.navigate(['vall']);
    })
  }

}

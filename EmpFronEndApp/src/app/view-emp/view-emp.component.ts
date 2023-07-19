import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-view-emp',
  templateUrl: './view-emp.component.html',
  styleUrls: ['./view-emp.component.css']
})
export class ViewEmpComponent implements OnInit {

  constructor(private empServ:EmployeeService, private route:ActivatedRoute) { }

  id:number;
  emp:Employee;
  ngOnInit(): void {
    this.showEmpInfo();
    }

    showEmpInfo()
    {
      this.id = this.route.snapshot.params['id'];
      this.emp = new Employee(); 
      this.empServ.SearchEmp(this.id).subscribe(data=>{
        console.log(data);
        this.emp = data;
      });  
    }
}

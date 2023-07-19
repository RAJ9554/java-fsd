import { Component, OnInit } from '@angular/core';
import { CrudHttpService } from '../crud-http.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  formValue!: FormGroup;
  employeeData: any[] = [];
  showModel = false;
  showPassModel = false;
  editRowIndex: number | null = null;

  constructor(private crudHttpService: CrudHttpService, private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      id: ['', Validators.required],
      firstname: ['', Validators.required],
      lastname: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });

    this.getAllEmployeeDetails();
  }

  postEmployeeDetails(): void {
    if (this.formValue.invalid) {
      return;
    }

    const employee = {
      id: this.formValue.value.id,
      first_name: this.formValue.value.firstname,
      last_name: this.formValue.value.lastname,
      email: this.formValue.value.email
    };

    this.crudHttpService.postEmployee(employee).subscribe(
      (res: any) => {
        console.log(res);
        alert('Employee added successfully');
        this.formValue.reset();
        this.closeModal();
        this.getAllEmployeeDetails();
      },
      (err: any) => {
        alert('Something went wrong');
      }
    );
  }

  getAllEmployeeDetails(): void {
    this.crudHttpService.getEmployee().subscribe(
      (res: any[]) => {
        this.employeeData = res;
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  deleteEmployee(row: any): void {
    this.crudHttpService.deleteEmployee(row.id).subscribe(
      (res: any) => {
        this.getAllEmployeeDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  onEdit(row: any): void {
    this.editRowIndex = row.id;
    this.formValue.setValue({
      id: row.id,
      firstname: row.first_name,
      lastname: row.last_name,
      email: row.email
    });
    this.showModel = true;
  }

  updateEmployeeDetails(): void {
    if (this.formValue.invalid || this.editRowIndex === null) {
      return;
    }

    const employee = {
      id: this.formValue.value.id,
      first_name: this.formValue.value.firstname,
      last_name: this.formValue.value.lastname,
      email: this.formValue.value.email
    };

    this.crudHttpService.updateEmployee(employee, employee.id).subscribe(
      (res: any) => {
        this.formValue.reset();
        this.editRowIndex = null;
        this.closeModal();
        this.getAllEmployeeDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  changePass(): void {
    alert('Password Updated Successfully');
  }

  closeModal(): void {
    this.showModel = false;
    this.showPassModel = false;
    this.formValue.reset();
    this.editRowIndex = null;
  }

  isEditMode(): boolean {
    return this.editRowIndex !== null;
  }

  logout(): void {
    // Implement your logout functionality here
    window.location.href = 'signin';
  }
}

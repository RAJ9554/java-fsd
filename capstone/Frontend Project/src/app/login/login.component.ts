import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginRef = new FormGroup({
    emailid: new FormControl(),
    password: new FormControl(),
    typeOfUser: new FormControl('user') // Default user type
  });
  msg: string = '';

  constructor(public ls: LoginService, public router: Router) {}

  ngOnInit(): void {}

  signIn() {
    let login = this.loginRef.value;
    console.log(login); // Check if the form values are being captured correctly

    this.ls.signIn(login).subscribe({
      next: (result: any) => {
        console.log(result); // Log the result to debug
        if (result === 'Admin Successfully login') {
          sessionStorage.setItem('userDetails', login.emailid);
          this.router.navigate(['/adminHome']);
        } else if (result === 'User successfully login') {
          sessionStorage.setItem('userDetails', login.emailid);
          this.router.navigate(['/userHome']);
        } else {
          this.msg = result; // Make sure the response from the server matches your expectations
        }
      },
      error: (error: any) => {
        console.error(error); // Log the error for debugging
        this.msg = 'An error occurred.';
      },
      complete: () => console.log('completed')
    });
  }
}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string;
  pswd:string;
  msg:string;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  LoginCheck()
  {
    if(this.username=="venugopal" && this.pswd=="12345")
      this.router.navigate(['welcome']);
    else
      this.msg = "Please check username/password";
  }
}

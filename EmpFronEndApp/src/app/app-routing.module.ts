import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewAllEmpsComponent } from './view-all-emps/view-all-emps.component';
import { NewempComponent } from './newemp/newemp.component';
import { ViewEmpComponent } from './view-emp/view-emp.component';
import {UpateEmpComponent} from './upate-emp/upate-emp.component';
const routes: Routes = [
  {path:'', component:ViewAllEmpsComponent},
  {path:'vall', component:ViewAllEmpsComponent},
  {path:'newemp', component:NewempComponent},
  {path:'oneemp/:id', component:ViewEmpComponent}, 
  {path:'updateemp/:id', component:UpateEmpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

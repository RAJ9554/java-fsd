import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddAadharComponent } from './add-aadhar/add-aadhar.component';
import { AdminAadharViewComponent } from './admin-aadhar-view/admin-aadhar-view.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { DeleteAadharComponent } from './delete-aadhar/delete-aadhar.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UpdateAadharComponent } from './update-aadhar/update-aadhar.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'adminHome', component: AdmindashboardComponent },
  { path: 'userHome', component: UserdashboardComponent },
  { path: 'applyforaadhar', component: AddAadharComponent },
  { path: 'signUp', component: SignupComponent },
  { path: 'updateAadhar', component: UpdateAadharComponent },
  { path: 'deleteAadhar', component: DeleteAadharComponent },
  { path: 'findAllAadhar', component: AdminAadharViewComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  // Add more routes as needed...
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}

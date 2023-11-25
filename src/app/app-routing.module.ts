// import { NgModule } from '@angular/core';
// import { RouterModule, Routes } from '@angular/router';
// import { AboutComponent } from './about/about.component';
// import { ContactComponent } from './contact/contact.component';
// import { RegistrationFormComponent } from './registration-form/registration-form.component';
// import { HomeComponent } from './home/home.component';
// import { UserlistComponent } from './userlist/userlist.component';
// import { SigninComponent } from './signin/signin.component';
// import { UpdateUserComponent } from './update-user/update-user.component';


// const routes: Routes = [
//   {
//     component:HomeComponent,
//     path:'home'
//   },
//   {
//     component:AboutComponent,
//     path:'about'
//   },
//   {
//     component:SigninComponent,
//     path:'signin'
//   },
//   {
//     component:ContactComponent,
//     path:'contact'
//   },
//   {
//     component:RegistrationFormComponent,
//     path:'register'
//   },
//   { component: UpdateUserComponent,
//      path:'update-user/:id' },

  
  
//   ,{path:"userlist", component:UserlistComponent},
                    // { path: 'create-employee', component: RegistrationFormComponent },
                   // { path: 'update-employee/:id', component: UpdateEmployeeComponent },
                  // {path:'employee-detailes/:id', component:EmployeeDetailesComponent},
//   {path:"",redirectTo:'userlist',pathMatch:'full'},
  
// ];

// @NgModule({
//   imports: [RouterModule.forRoot(routes)],
//   exports: [RouterModule]
// })
// export class AppRoutingModule { }


import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { HomeComponent } from './home/home.component';
import { UserlistComponent } from './userlist/userlist.component';
import { SigninComponent } from './signin/signin.component';
import { UpdateUserComponent } from './update-user/update-user.component'; // Add this import statement
import { BookingComponent } from './booking/booking.component';
import { UserdetailComponent } from './userdetail/userdetail.component';

const routes: Routes = [
  {
    component: HomeComponent,
    path: 'home'
  },
  {
    component: AboutComponent,
    path: 'about'
  },
  {
    component: SigninComponent,
    path: 'signin'
  },
  {
    component: ContactComponent,
    path: 'contact'
  },
  {
    component: RegistrationFormComponent,
    path: 'register'
  },
  {
    component: BookingComponent,
    path: 'booking'
  },
  {
    path: 'update-user/:id', component: UpdateUserComponent 
  },
  { 
    path: 'user-detail/:id', component: UserdetailComponent
  },
  { path: 'userlist', component: UserlistComponent },
  { path: "", redirectTo: 'userlist', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

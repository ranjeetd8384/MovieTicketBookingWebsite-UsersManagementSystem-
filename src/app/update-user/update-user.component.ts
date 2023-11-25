/*import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { UserDetails } from '../user-details';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent {
// onSubmit() {
// throw new Error('Method not implemented.');
// }
  id: number;
  user: UserDetails = new UserDetails();

  constructor(private userService: UserService, private route: ActivatedRoute, private router: Router) {
    this.id = this.route.snapshot.params['id'];
    this.userService.getUserById(this.id).subscribe(data => {
      this.user = data;
    });
  }

  updateUser() {
    this.userService.updateUser(this.user).subscribe(data => {
      console.log(data);
      this.router.navigate(['userlist']);
    });
  }
  // onSubmit(){
  //   console.log(this.user);
  //   this.saveEmployee();
  // }
  onSubmit() {
    // Call your service to update the user information
    this.userService.updateUser(this.user).subscribe(() => {
      
      console.log('User updated successfully');
      // You can navigate to another page or perform any other action after successful update
    });
  }
}*/
import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { UserDetails } from '../user-details';

// Create a new interface for the properties you want to update
// interface UserUpdate {
//   name?: string;
//   gender?: string;
//   email?: string;
//   phone?: string;
//   password?: string;
// }

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent  implements OnInit{
  id!: number;
  user: UserDetails = new UserDetails();

  // Create an instance of UserUpdate for updating user1
  // user1: UserUpdate = {
  //   name: '',
  //   gender: '',
  //   email: '',
  //   phone: '',
  //   password: ''
  // };

  // constructor(private userService: UserService, private route: ActivatedRoute, private router: Router) {
  //   this.id = this.route.snapshot.params['id'];
  //   this.userService.getUserById(this.id).subscribe(data => {
  //     this.user = data;
  //   });
  // }
  constructor(private userService: UserService,
    private route: ActivatedRoute,
    private router: Router) { }
  
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.userService.getUserById(this.id).subscribe(data => {
      this.user = data;
    }, error => console.log(error));
  }
  // updateUser() {
  //   const { id, oldPassword, ...updatedUser } = { ...this.user, ...this.user1 };
  
  //   this.userService.updateUser({ id, oldPassword }).subscribe(data => {
  //     console.log(data);
  //     this.router.navigate(['userlist']);
  //   });
  // }
  // updateUser() {
  //   const updatedUser = { ...this.user, ...this.user1 };
    
  //   this.userService.updateUser(updatedUser).subscribe(
  //     data => {
  //       console.log(data);
  //       this.router.navigate(['userlist']);
  //     },
  //     error => {
  //       console.error(error);
  //       // Handle error as needed
  //     }
  //   );
  // }

  // onSubmit() {
  //   // Exclude 'message' from the update operation
  //   const { name, gender, email, phone, password, ...updatedUser } = { ...this.user, ...this.user1 };

  //   this.userService.updateUser(updatedUser).subscribe(() => {
  //     console.log('User updated successfully');
  //     // You can navigate to another page or perform any other action after a successful update
  //   });
  // }

  onSubmit() {
    this.userService.updateUser(this.id, this.user).subscribe( data =>{
      this.goToUserList();
    }
    , error => console.log(error));
    // Exclude 'message' from the update operation
    // const { name, gender, email, phone, password, ...updatedUser } = { ...this.user, ...this.user1 };
  
    // this.userService.updateUser(updatedUser).subscribe(() => {
    //   console.log('User updated successfully');
    //   You can navigate to another page or perform any other action after a successful update
    // });
  }
  goToUserList(){
    this.router.navigate(['/userlist']);
  }
  
}

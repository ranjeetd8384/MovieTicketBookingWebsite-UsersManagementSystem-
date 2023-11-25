import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-userdetail',
  templateUrl: './userdetail.component.html',
  styleUrls: ['./userdetail.component.css']
})
export class UserdetailComponent implements OnInit{
  id!: number
  user!: UserDetails
  constructor(private route: ActivatedRoute, private userService: UserService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.user = new UserDetails();
    this.userService.getUserById(this.id).subscribe( data => {
      this.user = data;
    });
  }
}

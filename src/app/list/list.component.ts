import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Restaurant } from '../model/restaurant';
import { RestaurantService } from '../service/restaurant.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {



  rest: Restaurant[]=[];
  constructor(private restService:RestaurantService,private router: Router){}
  ngOnInit(): void {
    this.getProductall();
  }
  private getProductall(){
    this.restService.getRest().subscribe(data => {
      this.rest = data;
    });
  }


  deleteRestaurant(id: number){
    this.restService.deleteRest(id).subscribe( data => {
      console.log(data);
      this.getProductall();
    })
  }

  updateRest(id:number){
    this.router.navigate(['update', id]);
  }

 


}

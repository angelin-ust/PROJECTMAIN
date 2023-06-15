import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Restaurant } from '../model/restaurant';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  rest:Restaurant=new Restaurant();
  searchTerm = '';
  // constructor(private activatedRoute: ActivatedRoute, private router: Router) {
  //   this.activatedRoute.params.subscribe((params) => {
  //     if (params.searchTerm) {
  //       this.searchTerm = params.searchTerm;
  //       this.restaurant = new Restaurant();
  //       this.restaurant.restName = this.searchTerm;
  //     }
  //   });
  // }

  ngOnInit(): void {
  }

  // search(term:string):void{
  //   if(term)
  //   this.router.navigateByUrl('/search/'+ term);
  // }
}

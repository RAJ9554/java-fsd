import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-test-param',
  templateUrl: './test-param.component.html',
  styleUrls: ['./test-param.component.css']
})
export class TestParamComponent implements OnInit {

  constructor(private route:ActivatedRoute) { }

  val:number;

  ngOnInit(): void {  // it will be executed whenever component is initilzing
      this.val = this.route.snapshot.params['id'];
  }

}

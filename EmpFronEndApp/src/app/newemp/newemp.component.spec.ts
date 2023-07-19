import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewempComponent } from './newemp.component';

describe('NewempComponent', () => {
  let component: NewempComponent;
  let fixture: ComponentFixture<NewempComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewempComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewempComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAadharComponent } from './update-aadhar.component';

describe('UpdateAadharComponent', () => {
  let component: UpdateAadharComponent;
  let fixture: ComponentFixture<UpdateAadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateAadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateAadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

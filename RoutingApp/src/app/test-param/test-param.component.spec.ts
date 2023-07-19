import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestParamComponent } from './test-param.component';

describe('TestParamComponent', () => {
  let component: TestParamComponent;
  let fixture: ComponentFixture<TestParamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestParamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestParamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

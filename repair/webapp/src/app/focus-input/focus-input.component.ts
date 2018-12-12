import {ChangeDetectorRef, Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
	selector: 'focus-input',
	templateUrl: './focus-input.component.html',
	styleUrls: ['./focus-input.component.scss']
})
export class FocusInputComponent implements OnInit {

	focus: string;
	focusSet = false;

	@Output('onFocusSet')
	focusSetEventEmitter: EventEmitter<string> = new EventEmitter();

	constructor(private changeDetector: ChangeDetectorRef) {
	}

	ngOnInit() {
	}

	public clearFocus() {
		this.focus = null;
		this.focusSet = false;
		this.changeDetector.detectChanges();
	};

	setFocus(value) {
		this.focus = value;
		this.focusSet = true;
		this.focusSetEventEmitter.emit(value);
	}
}

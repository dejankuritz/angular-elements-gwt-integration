import {Component, EventEmitter, Input, Output, ViewChild} from '@angular/core';
import {FocusInputComponent} from "../focus-input/focus-input.component";

@Component({
	selector: 'repair-widget',
	templateUrl: './repair-widget.component.html',
	styleUrls: ['./repair-widget.component.scss']
})
export class RepairWidgetComponent {

	@Input()
	name = 'friend';
	@Output('onFocusSet')
	focusSetEventEmitter: EventEmitter<string> = new EventEmitter();

	@ViewChild('focusInput')
	focusInput: FocusInputComponent;

	constructor() {
	}

	emitFocusSet(value) {
		this.focusSetEventEmitter.emit(value);
	}

	@Input()
	public clearFocus = () => {
		this.focusInput.clearFocus();
	};
}

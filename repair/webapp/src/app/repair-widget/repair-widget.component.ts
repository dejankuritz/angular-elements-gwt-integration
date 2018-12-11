import {ChangeDetectorRef, Component, EventEmitter, Input, Output} from '@angular/core';

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

	focus: string;
	focusSet = false;

	constructor(private changeDetector: ChangeDetectorRef) {

	}

	@Input()
	public clearFocus = () => {
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

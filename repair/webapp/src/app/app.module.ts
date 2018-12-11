import {BrowserModule} from '@angular/platform-browser';
import {Injector, NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {createCustomElement} from "@angular/elements";
import {RepairWidgetComponent} from './repair-widget/repair-widget.component';
import {APP_BASE_HREF} from "@angular/common";

@NgModule({
	declarations: [
		RepairWidgetComponent
	],
	imports: [
		BrowserModule,
		AppRoutingModule
	],
	providers: [
		{provide: APP_BASE_HREF, useValue: '/'}
	],
	entryComponents: [
		RepairWidgetComponent
	]
})
export class AppModule {

	constructor(private injector: Injector) {
	}

	ngDoBootstrap() {
		customElements.define('repair-widget',
			createCustomElement(RepairWidgetComponent, {injector: this.injector}) as Function);
	}
}

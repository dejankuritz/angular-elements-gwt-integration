"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var BasicHeader = /** @class */ (function (_super) {
    __extends(BasicHeader, _super);
    function BasicHeader() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    BasicHeader.prototype.connectedCallback = function () {
        this.initTextContent();
        this.initButton();
    };
    BasicHeader.prototype.clearText = function () {
        this.setHeaderText('empty');
    };
    BasicHeader.prototype.initTextContent = function () {
        var content = this.getAttribute('content');
        content = (content) ? content : BasicHeader.DEFAULT_TEXT;
        this.setHeaderText(content);
    };
    BasicHeader.prototype.initButton = function () {
        if (!this.button) {
            this.button = document.createElement('button');
            this.button.textContent = 'ClickMePlz!';
            this.button.addEventListener("click", this.dispatchSubmitEvent.bind(this));
            this.appendChild(this.button);
        }
    };
    BasicHeader.prototype.dispatchSubmitEvent = function () {
        var event = new CustomEvent('basicSubmit', { detail: { status: 'test' } });
        console.log('Dispatching event' + JSON.stringify(event) + ' / ' + JSON.stringify(event.detail));
        this.dispatchEvent(event);
    };
    BasicHeader.prototype.setHeaderText = function (text) {
        if (!this.header) {
            this.header = document.createElement('h1');
            this.header.textContent = text;
            this.appendChild(this.header);
        }
        else {
            this.header.textContent = text;
        }
    };
    BasicHeader.DEFAULT_TEXT = 'change me plz';
    return BasicHeader;
}(HTMLElement));
window.customElements.define('basic-header', BasicHeader);
//# sourceMappingURL=basic-header.js.map
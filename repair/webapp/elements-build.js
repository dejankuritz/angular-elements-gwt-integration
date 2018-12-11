const fs = require('fs-extra')
const concat = require('concat');

(async function build () {
	const files = [
		'./dist/webapp/runtime.js',
		'./dist/webapp/polyfills.js',
		'./dist/webapp/scripts.js',
		'./dist/webapp/main.js'
	]

	await fs.ensureDir('elements')
	await concat(files, 'elements/repair-widget.js')
	await fs.copyFile(
		'./dist/webapp/styles.css',
		'elements/styles.css'
	)
})()
Ext.define('MyApp.controller.Main', {
	extend : 'Ext.app.Controller',
	stores : [ 'MyApp.store.Person' ],
	models : [ 'MyApp.store.Person' ],
	views : [],
	init : function() {
		console.log('MyApp.controller.Main - Initialized');
		this.control({

		});
	}
});

Ext.define('MyApp.store.Person', {
	extend : 'Ext.data.Store',
	id : 'Person',
	model : 'MyApp.model.Person',
	data : [ {
		name : 'Persons'
	}, {
		name : 'Inventories'
	} ],
	proxy : {
		type : 'memory'
	}

});
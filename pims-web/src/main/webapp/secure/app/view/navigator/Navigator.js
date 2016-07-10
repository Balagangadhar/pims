Ext.define('MyApp.view.navigator.Navigator', {
	extend : 'Ext.grid.Panel',
	xtype : 'navigator',
	columns : [ {
		text : 'Name',
		dataIndex : 'name',
		flex : 1,
		renderer : function(value) {
			return '<a href="#">' + value + '</a>';
		}
	} ],
	hideHeaders:true,
	initComponent : function() {
		var store = Ext.create('MyApp.store.Person');
		store.load();
		Ext.apply(this, {
			store : store
		});
		this.callParent(arguments);
	}
});

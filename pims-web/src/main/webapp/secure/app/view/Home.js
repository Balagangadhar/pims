Ext.define('MyApp.view.Home', {
	extend : 'Ext.panel.Panel',
	xtype : 'home',
	layout : 'border',
	requires : [ 'MyApp.view.navigator.Navigator', 'MyApp.view.workspace.Workspace' ],
	height : 600,
	items : [ {
		xtype : 'navigator',
		title : 'Navigator',
		region : 'west',
		collapsible : true,
		split : true,
		width : 200
	}, {
		xtype : 'workspace',
		title : 'Workspace',
		region : 'center',
	} ]

});

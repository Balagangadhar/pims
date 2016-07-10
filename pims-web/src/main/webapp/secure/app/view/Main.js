Ext.define('MyApp.view.Main', {
	extend : 'Ext.panel.Panel',
	xtype : 'appmain',
	requires : [ 'MyApp.view.Home' ],
	tbar : [ {
		xtype : 'label',
		html : '<font color="#FFA500"><h2>Personnel and Inventory Management</h2></font>'
	}, '->', {
		xtype : 'label',
		html : '<a href="#">Smith</a>'
	}, {
		text : 'Logout'
	} ],
	items : [ {
		xtype : 'home'
	} ]
});

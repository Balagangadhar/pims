/**
 * The main application viewport, which displays the whole application
 * 
 * @extends Ext.Viewport
 */
Ext.define('MyApp.view.Viewport', {
	extend : 'Ext.Viewport',
	layout : 'fit',
	requires : [ 'MyApp.view.Main' ],
	initComponent : function() {
		var me = this;

		Ext.apply(me, {
			items : [ {
				xtype : 'appmain',
			} ]
		});

		me.callParent(arguments);
	}
});

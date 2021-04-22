Ext.define('extJSApp.widget.user.UserWindow', {
    extend: 'Ext.window.Window',
    xtype: 'userwindow',
    layout: 'fit',
    iconCls: 'x-fa fa-user',
    title: 'Пользователь',
    titleAlign: 'center',
    ghost: false,
    listeners: {
        beforeclose: function (window, eOpts) {
            if (window.down('form').isDirty() && !window.isConfirmed) {
                Ext.MessageBox.confirm('Закрытие окна', 'Вы точно хотите закрыть это окно? Все несохранённые данные будут удалены.',
                    function (btn) {
                        if (btn === 'yes') {
                            window.isConfirmed = true;
                            window.close();
                        }
                    });
                return false;
            } else {
                window.isConfirmed = false;
                return true;
            }
        }
    },
    items: [{
        xtype: 'userform',
    }]
});
var exec = require("cordova/exec");

// TODO: Needs Success and failure handling.

var InvitePlugin = {

    sendInvite: function () {
        exec(function(){}, function(){}, "InvitePlugin", "invite", []);
        console.log("js function procced");
    }
};

module.exports = InvitePlugin;
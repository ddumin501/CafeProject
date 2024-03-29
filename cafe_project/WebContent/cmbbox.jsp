<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="styles/kendo.common.min.css" />
    <link rel="stylesheet" href="styles/kendo.default.min.css" />
    <link rel="stylesheet" href="styles/kendo.default.mobile.min.css" />

    <script src="js/jquery.min.js"></script>
    <script src="js/kendo.all.min.js"></script>
    

</head>
<body>

        <div id="example">

            <div class="demo-section k-content">
                <h4>Customers</h4>
                <input id="customers" style="width: 100%"/>
                <p class="demo-hint">
                    Open the ComboBox to see the customized appearance.
                </p>
            </div>

            <script>
                $(document).ready(function() {
                    $("#customers").kendoComboBox({
                        filter:"startswith",
                        dataTextField: "ContactName",
                        dataValueField: "CustomerID",
                        headerTemplate: '<div class="dropdown-header k-widget k-header">' +
                                '<span>Photo</span>' +
                                '<span>Contact info</span>' +
                            '</div>',
                        footerTemplate: 'Total #: instance.dataSource.total() # items found',
                        template: '<span class="k-state-default" style="background-image: url(\'../content/web/Customers/#:data.CustomerID#.jpg\')"></span>' +
                                  '<span class="k-state-default"><h3>#: data.ContactName #</h3><p>#: data.CompanyName #</p></span>',
                        dataSource: {
                            transport: {
                                read: {
                                    dataType: "jsonp",
                                    url: "https://demos.telerik.com/kendo-ui/service/Customers"
                                }
                            }
                        },
                        height: 400
                    });
                });
            </script>

            <style>

                .dropdown-header {
                    border-width: 0 0 1px 0;
                    text-transform: uppercase;
                }

                .dropdown-header > span {
                    display: inline-block;
                    padding: 10px;
                }

                .dropdown-header > span:first-child {
                    width: 50px;
                }

                .k-list-container > .k-footer {
                    padding: 10px;
                }

                #customers-list .k-item {
                    line-height: 1em;
                    min-width: 300px;
                }

                /* Material Theme padding adjustment*/

                .k-material #customers-list .k-item,
                .k-material #customers-list .k-item.k-state-hover,
                .k-materialblack #customers-list .k-item,
                .k-materialblack #customers-list .k-item.k-state-hover {
                    padding-left: 5px;
                    border-left: 0;
                }

                #customers-list .k-item > span {
                    -webkit-box-sizing: border-box;
                    -moz-box-sizing: border-box;
                    box-sizing: border-box;
                    display: inline-block;
                    vertical-align: top;
                    margin: 20px 10px 10px 5px;
                }

                #customers-list .k-item > span:first-child {
                    -moz-box-shadow: inset 0 0 30px rgba(0,0,0,.3);
                    -webkit-box-shadow: inset 0 0 30px rgba(0,0,0,.3);
                    box-shadow: inset 0 0 30px rgba(0,0,0,.3);
                    margin: 10px;
                    width: 50px;
                    height: 50px;
                    border-radius: 50%;
                    background-size: 100%;
                    background-repeat: no-repeat;
                }

                #customers-list h3 {
                    font-size: 1.2em;
                    font-weight: normal;
                    margin: 0 0 1px 0;
                    padding: 0;
                }

                #customers-list p {
                    margin: 0;
                    padding: 0;
                    font-size: .8em;
                }

            </style>
        </div>


</body>
</html>
<#include "sidebar.ftl">
<#import "/spring.ftl" as spring/>
<div style="margin-top: -50px;">
    <div class="container">
        <div class="row">
            <div class="col-sm"></div>
            <div class="col-sm">
                <div class="card">
                    <h5 class="card-header">Customer Acquisition</h5>
                    <div class="card-body">
                        <div class="ct-chart ct-golden-section" style="height: 354px;"></div>
                        <div class="text-center">
                                            <span class="legend-item mr-2">
                                                    <span class="fa-xs text-primary mr-1 legend-tile"><i
                                                                class="fa fa-fw fa-square-full"></i></span>
                                            <span class="legend-text">Returning</span>
                                            </span>
                            <span class="legend-item mr-2">

                                                    <span class="fa-xs text-secondary mr-1 legend-tile"><i
                                                                class="fa fa-fw fa-square-full"></i></span>
                                            <span class="legend-text">First Time</span>
                                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<#include "../footer.ftl">
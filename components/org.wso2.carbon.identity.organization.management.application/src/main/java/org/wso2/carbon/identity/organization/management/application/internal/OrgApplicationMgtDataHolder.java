package org.wso2.carbon.identity.organization.management.application.internal;

import org.wso2.carbon.identity.application.mgt.ApplicationManagementService;
import org.wso2.carbon.identity.oauth.OAuthAdminServiceImpl;
import org.wso2.carbon.identity.organization.management.application.dao.OrgApplicationMgtDAO;
import org.wso2.carbon.user.core.service.RealmService;

/**
 *
 */
public class OrgApplicationMgtDataHolder {

    private static final OrgApplicationMgtDataHolder dataHolder = new OrgApplicationMgtDataHolder();

    private OrgApplicationMgtDAO orgApplicationMgtDAO;
    private RealmService realmService;
    private ApplicationManagementService applicationManagementService;
    private OAuthAdminServiceImpl oAuthAdminService;

    private OrgApplicationMgtDataHolder() {
    }

    public static OrgApplicationMgtDataHolder getInstance() {

        return dataHolder;
    }

    public OrgApplicationMgtDAO getOrgApplicationMgtDAO() {

        return orgApplicationMgtDAO;
    }

    public void setOrgApplicationMgtDAO(OrgApplicationMgtDAO orgApplicationMgtDAO) {

        this.orgApplicationMgtDAO = orgApplicationMgtDAO;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public ApplicationManagementService getApplicationManagementService() {

        return applicationManagementService;
    }

    public void setApplicationManagementService(ApplicationManagementService applicationManagementService) {

        this.applicationManagementService = applicationManagementService;
    }

    public OAuthAdminServiceImpl getoAuthAdminService() {

        return oAuthAdminService;
    }

    public void setoAuthAdminService(OAuthAdminServiceImpl oAuthAdminService) {

        this.oAuthAdminService = oAuthAdminService;
    }
}

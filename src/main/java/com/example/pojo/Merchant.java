package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SharingWoo on 2017/3/16.
 */
public class Merchant implements Serializable {
        private String merchantId;

        private String merchantName;

        private String organizationId;

        private String merchantType;

        private String businessId;

        private String corporateName;

        private String corporateType;

        private String corporateNo;

        private String settlementAcctName;

        private String settlementAcct;

        private String settlementAcctType;

        private String settlementBank;

        private String settlementBankAddr;

        private String merchantSettlementCycle;

        private Date openingTime;

        private String registeredCapital;

        private String mcc;

        private String contactPerson;

        private String contactTelephone;

        private String contactPhone;

        private String contactEmail;

        private Long presetAmount;

        private String province;

        private String city;

        private String addr;

        private String status;

        private Date businessDate;

        private Date certificateDate;

        private String merchantSource;

        private String merchantDevelop;

        private Date withdrawTime;

        private Date updateTime;

        private String merchantBusinessIdent;

        private String merchantProductIdent;

        private String transStatus;

        private String creditStatus;

        private String capitalCleanStatus;

        private Date createAt;

        private String createBy;

        private Date lastUpdateAt;

        private String lastUpdateBy;

        private static final long serialVersionUID = 1L;

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId == null ? null : merchantId.trim();
        }

        public String getMerchantName() {
            return merchantName;
        }

        public void setMerchantName(String merchantName) {
            this.merchantName = merchantName == null ? null : merchantName.trim();
        }

        public String getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(String organizationId) {
            this.organizationId = organizationId == null ? null : organizationId.trim();
        }

        public String getMerchantType() {
            return merchantType;
        }

        public void setMerchantType(String merchantType) {
            this.merchantType = merchantType == null ? null : merchantType.trim();
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId == null ? null : businessId.trim();
        }

        public String getCorporateName() {
            return corporateName;
        }

        public void setCorporateName(String corporateName) {
            this.corporateName = corporateName == null ? null : corporateName.trim();
        }

        public String getCorporateType() {
            return corporateType;
        }

        public void setCorporateType(String corporateType) {
            this.corporateType = corporateType == null ? null : corporateType.trim();
        }

        public String getCorporateNo() {
            return corporateNo;
        }

        public void setCorporateNo(String corporateNo) {
            this.corporateNo = corporateNo == null ? null : corporateNo.trim();
        }

        public String getSettlementAcctName() {
            return settlementAcctName;
        }

        public void setSettlementAcctName(String settlementAcctName) {
            this.settlementAcctName = settlementAcctName == null ? null : settlementAcctName.trim();
        }

        public String getSettlementAcct() {
            return settlementAcct;
        }

        public void setSettlementAcct(String settlementAcct) {
            this.settlementAcct = settlementAcct == null ? null : settlementAcct.trim();
        }

        public String getSettlementAcctType() {
            return settlementAcctType;
        }

        public void setSettlementAcctType(String settlementAcctType) {
            this.settlementAcctType = settlementAcctType == null ? null : settlementAcctType.trim();
        }

        public String getSettlementBank() {
            return settlementBank;
        }

        public void setSettlementBank(String settlementBank) {
            this.settlementBank = settlementBank == null ? null : settlementBank.trim();
        }

        public String getSettlementBankAddr() {
            return settlementBankAddr;
        }

        public void setSettlementBankAddr(String settlementBankAddr) {
            this.settlementBankAddr = settlementBankAddr == null ? null : settlementBankAddr.trim();
        }

        public String getMerchantSettlementCycle() {
            return merchantSettlementCycle;
        }

        public void setMerchantSettlementCycle(String merchantSettlementCycle) {
            this.merchantSettlementCycle = merchantSettlementCycle == null ? null : merchantSettlementCycle.trim();
        }

        public Date getOpeningTime() {
            return openingTime;
        }

        public void setOpeningTime(Date openingTime) {
            this.openingTime = openingTime;
        }

        public String getRegisteredCapital() {
            return registeredCapital;
        }

        public void setRegisteredCapital(String registeredCapital) {
            this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
        }

        public String getMcc() {
            return mcc;
        }

        public void setMcc(String mcc) {
            this.mcc = mcc == null ? null : mcc.trim();
        }

        public String getContactPerson() {
            return contactPerson;
        }

        public void setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson == null ? null : contactPerson.trim();
        }

        public String getContactTelephone() {
            return contactTelephone;
        }

        public void setContactTelephone(String contactTelephone) {
            this.contactTelephone = contactTelephone == null ? null : contactTelephone.trim();
        }

        public String getContactPhone() {
            return contactPhone;
        }

        public void setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone == null ? null : contactPhone.trim();
        }

        public String getContactEmail() {
            return contactEmail;
        }

        public void setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail == null ? null : contactEmail.trim();
        }

        public Long getPresetAmount() {
            return presetAmount;
        }

        public void setPresetAmount(Long presetAmount) {
            this.presetAmount = presetAmount;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province == null ? null : province.trim();
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city == null ? null : city.trim();
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr == null ? null : addr.trim();
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status == null ? null : status.trim();
        }

        public Date getBusinessDate() {
            return businessDate;
        }

        public void setBusinessDate(Date businessDate) {
            this.businessDate = businessDate;
        }

        public Date getCertificateDate() {
            return certificateDate;
        }

        public void setCertificateDate(Date certificateDate) {
            this.certificateDate = certificateDate;
        }

        public String getMerchantSource() {
            return merchantSource;
        }

        public void setMerchantSource(String merchantSource) {
            this.merchantSource = merchantSource == null ? null : merchantSource.trim();
        }

        public String getMerchantDevelop() {
            return merchantDevelop;
        }

        public void setMerchantDevelop(String merchantDevelop) {
            this.merchantDevelop = merchantDevelop == null ? null : merchantDevelop.trim();
        }

        public Date getWithdrawTime() {
            return withdrawTime;
        }

        public void setWithdrawTime(Date withdrawTime) {
            this.withdrawTime = withdrawTime;
        }

        public Date getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public String getMerchantBusinessIdent() {
            return merchantBusinessIdent;
        }

        public void setMerchantBusinessIdent(String merchantBusinessIdent) {
            this.merchantBusinessIdent = merchantBusinessIdent == null ? null : merchantBusinessIdent.trim();
        }

        public String getMerchantProductIdent() {
            return merchantProductIdent;
        }

        public void setMerchantProductIdent(String merchantProductIdent) {
            this.merchantProductIdent = merchantProductIdent == null ? null : merchantProductIdent.trim();
        }

        public String getTransStatus() {
            return transStatus;
        }

        public void setTransStatus(String transStatus) {
            this.transStatus = transStatus == null ? null : transStatus.trim();
        }

        public String getCreditStatus() {
            return creditStatus;
        }

        public void setCreditStatus(String creditStatus) {
            this.creditStatus = creditStatus == null ? null : creditStatus.trim();
        }

        public String getCapitalCleanStatus() {
            return capitalCleanStatus;
        }

        public void setCapitalCleanStatus(String capitalCleanStatus) {
            this.capitalCleanStatus = capitalCleanStatus == null ? null : capitalCleanStatus.trim();
        }

        public Date getCreateAt() {
            return createAt;
        }

        public void setCreateAt(Date createAt) {
            this.createAt = createAt;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy == null ? null : createBy.trim();
        }

        public Date getLastUpdateAt() {
            return lastUpdateAt;
        }

        public void setLastUpdateAt(Date lastUpdateAt) {
            this.lastUpdateAt = lastUpdateAt;
        }

        public String getLastUpdateBy() {
            return lastUpdateBy;
        }

        public void setLastUpdateBy(String lastUpdateBy) {
            this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
        }

        @Override
        public boolean equals(Object that) {
            if (this == that) {
                return true;
            }
            if (that == null) {
                return false;
            }
            if (getClass() != that.getClass()) {
                return false;
            }
            Merchant other = (Merchant) that;
            return (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
                    && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
                    && (this.getOrganizationId() == null ? other.getOrganizationId() == null : this.getOrganizationId().equals(other.getOrganizationId()))
                    && (this.getMerchantType() == null ? other.getMerchantType() == null : this.getMerchantType().equals(other.getMerchantType()))
                    && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
                    && (this.getCorporateName() == null ? other.getCorporateName() == null : this.getCorporateName().equals(other.getCorporateName()))
                    && (this.getCorporateType() == null ? other.getCorporateType() == null : this.getCorporateType().equals(other.getCorporateType()))
                    && (this.getCorporateNo() == null ? other.getCorporateNo() == null : this.getCorporateNo().equals(other.getCorporateNo()))
                    && (this.getSettlementAcctName() == null ? other.getSettlementAcctName() == null : this.getSettlementAcctName().equals(other.getSettlementAcctName()))
                    && (this.getSettlementAcct() == null ? other.getSettlementAcct() == null : this.getSettlementAcct().equals(other.getSettlementAcct()))
                    && (this.getSettlementAcctType() == null ? other.getSettlementAcctType() == null : this.getSettlementAcctType().equals(other.getSettlementAcctType()))
                    && (this.getSettlementBank() == null ? other.getSettlementBank() == null : this.getSettlementBank().equals(other.getSettlementBank()))
                    && (this.getSettlementBankAddr() == null ? other.getSettlementBankAddr() == null : this.getSettlementBankAddr().equals(other.getSettlementBankAddr()))
                    && (this.getMerchantSettlementCycle() == null ? other.getMerchantSettlementCycle() == null : this.getMerchantSettlementCycle().equals(other.getMerchantSettlementCycle()))
                    && (this.getOpeningTime() == null ? other.getOpeningTime() == null : this.getOpeningTime().equals(other.getOpeningTime()))
                    && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
                    && (this.getMcc() == null ? other.getMcc() == null : this.getMcc().equals(other.getMcc()))
                    && (this.getContactPerson() == null ? other.getContactPerson() == null : this.getContactPerson().equals(other.getContactPerson()))
                    && (this.getContactTelephone() == null ? other.getContactTelephone() == null : this.getContactTelephone().equals(other.getContactTelephone()))
                    && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
                    && (this.getContactEmail() == null ? other.getContactEmail() == null : this.getContactEmail().equals(other.getContactEmail()))
                    && (this.getPresetAmount() == null ? other.getPresetAmount() == null : this.getPresetAmount().equals(other.getPresetAmount()))
                    && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
                    && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
                    && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
                    && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                    && (this.getBusinessDate() == null ? other.getBusinessDate() == null : this.getBusinessDate().equals(other.getBusinessDate()))
                    && (this.getCertificateDate() == null ? other.getCertificateDate() == null : this.getCertificateDate().equals(other.getCertificateDate()))
                    && (this.getMerchantSource() == null ? other.getMerchantSource() == null : this.getMerchantSource().equals(other.getMerchantSource()))
                    && (this.getMerchantDevelop() == null ? other.getMerchantDevelop() == null : this.getMerchantDevelop().equals(other.getMerchantDevelop()))
                    && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
                    && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                    && (this.getMerchantBusinessIdent() == null ? other.getMerchantBusinessIdent() == null : this.getMerchantBusinessIdent().equals(other.getMerchantBusinessIdent()))
                    && (this.getMerchantProductIdent() == null ? other.getMerchantProductIdent() == null : this.getMerchantProductIdent().equals(other.getMerchantProductIdent()))
                    && (this.getTransStatus() == null ? other.getTransStatus() == null : this.getTransStatus().equals(other.getTransStatus()))
                    && (this.getCreditStatus() == null ? other.getCreditStatus() == null : this.getCreditStatus().equals(other.getCreditStatus()))
                    && (this.getCapitalCleanStatus() == null ? other.getCapitalCleanStatus() == null : this.getCapitalCleanStatus().equals(other.getCapitalCleanStatus()))
                    && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
                    && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
                    && (this.getLastUpdateAt() == null ? other.getLastUpdateAt() == null : this.getLastUpdateAt().equals(other.getLastUpdateAt()))
                    && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()));
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
            result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
            result = prime * result + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
            result = prime * result + ((getMerchantType() == null) ? 0 : getMerchantType().hashCode());
            result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
            result = prime * result + ((getCorporateName() == null) ? 0 : getCorporateName().hashCode());
            result = prime * result + ((getCorporateType() == null) ? 0 : getCorporateType().hashCode());
            result = prime * result + ((getCorporateNo() == null) ? 0 : getCorporateNo().hashCode());
            result = prime * result + ((getSettlementAcctName() == null) ? 0 : getSettlementAcctName().hashCode());
            result = prime * result + ((getSettlementAcct() == null) ? 0 : getSettlementAcct().hashCode());
            result = prime * result + ((getSettlementAcctType() == null) ? 0 : getSettlementAcctType().hashCode());
            result = prime * result + ((getSettlementBank() == null) ? 0 : getSettlementBank().hashCode());
            result = prime * result + ((getSettlementBankAddr() == null) ? 0 : getSettlementBankAddr().hashCode());
            result = prime * result + ((getMerchantSettlementCycle() == null) ? 0 : getMerchantSettlementCycle().hashCode());
            result = prime * result + ((getOpeningTime() == null) ? 0 : getOpeningTime().hashCode());
            result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
            result = prime * result + ((getMcc() == null) ? 0 : getMcc().hashCode());
            result = prime * result + ((getContactPerson() == null) ? 0 : getContactPerson().hashCode());
            result = prime * result + ((getContactTelephone() == null) ? 0 : getContactTelephone().hashCode());
            result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
            result = prime * result + ((getContactEmail() == null) ? 0 : getContactEmail().hashCode());
            result = prime * result + ((getPresetAmount() == null) ? 0 : getPresetAmount().hashCode());
            result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
            result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
            result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
            result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
            result = prime * result + ((getBusinessDate() == null) ? 0 : getBusinessDate().hashCode());
            result = prime * result + ((getCertificateDate() == null) ? 0 : getCertificateDate().hashCode());
            result = prime * result + ((getMerchantSource() == null) ? 0 : getMerchantSource().hashCode());
            result = prime * result + ((getMerchantDevelop() == null) ? 0 : getMerchantDevelop().hashCode());
            result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
            result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
            result = prime * result + ((getMerchantBusinessIdent() == null) ? 0 : getMerchantBusinessIdent().hashCode());
            result = prime * result + ((getMerchantProductIdent() == null) ? 0 : getMerchantProductIdent().hashCode());
            result = prime * result + ((getTransStatus() == null) ? 0 : getTransStatus().hashCode());
            result = prime * result + ((getCreditStatus() == null) ? 0 : getCreditStatus().hashCode());
            result = prime * result + ((getCapitalCleanStatus() == null) ? 0 : getCapitalCleanStatus().hashCode());
            result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
            result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
            result = prime * result + ((getLastUpdateAt() == null) ? 0 : getLastUpdateAt().hashCode());
            result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
            return result;
        }
    }
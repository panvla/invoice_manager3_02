package com.vladimirpandurov.invoice_manager3_02.service;

import com.vladimirpandurov.invoice_manager3_02.domain.Role;

public interface RoleService {

    Role getRoleByUserId(Long userId);

}

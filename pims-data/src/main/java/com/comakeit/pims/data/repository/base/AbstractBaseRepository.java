package com.comakeit.pims.data.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.comakeit.pims.data.entity.base.AbstractBaseEntity;

@NoRepositoryBean
public interface AbstractBaseRepository<E extends AbstractBaseEntity> extends JpaRepository<E, String> {

}

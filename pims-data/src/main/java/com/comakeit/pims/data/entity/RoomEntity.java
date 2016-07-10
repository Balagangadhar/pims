package com.comakeit.pims.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.comakeit.pims.common.utils.ApplicationEntityConstant;
import com.comakeit.pims.data.entity.base.AbstractBaseEntity;

@Entity
@Table(name = ApplicationEntityConstant.Table.ROOM)
public class RoomEntity extends AbstractBaseEntity {

}

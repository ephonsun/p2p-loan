package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @descripe 用户账户流水实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Getter@Setter
public class AccountFlow extends BaseDomain {
	/**
	 * 流水发生的账户
	 */
	private Account account;
	/**
	 * 产生流水的时间
	 */
	private Date tradeTime;
	/**
	 * 流水的类型
	 */
	private Integer actionType;
	/**
	 * 业务金额
	 */
	private BigDecimal amount;
	/**
	 * 操作后的账户金额
	 */
	private BigDecimal usableAmount;
	/**
	 * 操作后的冻结金额
	 */
	private BigDecimal freezedAmount;
	/**
	 * 流水说明
	 */
	private String note;
}

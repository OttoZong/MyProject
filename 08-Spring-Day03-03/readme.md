@Component  為所有需要被Spring管理的類添加註解.
@Resource	對屬性進行註解.
	
以上編寫完畢後,就可以直接透過Spring獲得Uservice2的對象,並且,其中的UserDao屬性已經被注入值.

	<!-- 配置組件掃描 -->
			<context:component-scan 
			base-package="cn.tedu.spring" />
			
			
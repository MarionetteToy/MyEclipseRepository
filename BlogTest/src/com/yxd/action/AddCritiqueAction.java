package com.yxd.action;

import java.util.Map;

import com.yxd.po.Critique;
import com.yxd.service.CritiqueService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddCritiqueAction extends ActionSupport {
	private CritiqueService critiqueService;
	private int id;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CritiqueService getCritiqueService() {
		return critiqueService;
	}

	public void setCritiqueService(CritiqueService critiqueService) {
		this.critiqueService = critiqueService;
	}

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		if(username == null || "".equals(username)) {
			username = "ÄäÃû";
		}
		Critique critique = new Critique();
		critique.setAId(id);
		critique.setContent(content);
		critique.setUsername(username);

		// ±£´æÆÀÂÛ
		this.critiqueService.addCritique(critique);

		return SUCCESS;
	}

}
